package gsmarena;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class GsmArena {

    public static final String OUTPUT_FILE = "phones.csv";
    private final List<String> itemUrls;

    public GsmArena(List<String> urls) {
        this.itemUrls = urls;
    }

    public void scrape() {
        try (PrintStream output = new PrintStream(
                new FileOutputStream(OUTPUT_FILE, false),
                true, StandardCharsets.UTF_8.name()
        )) {
            tryScrape(output);
        } catch (IOException e) {
            System.err.printf("Could not open %s file, due to: %s", OUTPUT_FILE, e.getMessage());
        }
    }

    private void tryScrape(PrintStream output) {
        writeHeader(output);

        itemUrls.forEach(url -> DocumentExtractor.getDocument(url)
                .map(PhoneDetailsParser::parseData)
                .ifPresent(data -> writeToFile(output, data)));
    }

    private static void writeHeader(PrintStream output) {
        String header = String.join("\t", PhoneDetailType.getAllNames());

        writeToFile(output, header);
    }

    private static synchronized void writeToFile(PrintStream writer, String csv) {
        writer.append(csv).append("\n");
    }
}
