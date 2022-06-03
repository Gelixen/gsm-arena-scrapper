package gsmarena;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.Arrays;

public final class PhoneDetailsParser {

    public static final String DATA_ATTRIBUTE_KEY = "data-spec";
    public static final String DATA_ATTRIBUTE_QUERY = String.format("[%s]", DATA_ATTRIBUTE_KEY);

    private static final String[] partDetails = new String[PhoneDetailType.values().length];

    public static String parseData(Document document) {
        Arrays.fill(partDetails, "");

        document.select(DATA_ATTRIBUTE_QUERY).forEach(PhoneDetailsParser::parseElement);

        addUrl(document.location());

        return String.join("\t", partDetails);
    }

    private static void addUrl(String url) {
        partDetails[PhoneDetailType.URL.ordinal()] = url;
    }

    private static void parseElement(Element element) {
        String attributeName = element.attr(DATA_ATTRIBUTE_KEY);
        String attributeValue = element.text();

        try {
            int detailTypeIndex = PhoneDetailType.fromText(attributeName).ordinal();
            partDetails[detailTypeIndex] = attributeValue;
        } catch (RuntimeException e) {
            System.out.println(e + " " + element.baseUri());
        }
    }

}