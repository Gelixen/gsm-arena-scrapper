package gsmarena;

import java.util.Arrays;

public enum PhoneDetailType {
    MODELNAME("Model name", "modelname"),
    RELEASED_HL("Release date", "released-hl"),
    BODY_HL("Body", "body-hl"),
    OS_HL("OS", "os-hl"),
    STORAGE_HL("Storage", "storage-hl"),
    DISPLAYSIZE_HL("Display size", "displaysize-hl"),
    DISPLAYRES_HL("Display resolution", "displayres-hl"),
    CAMERAPIXELS_HL("CAMERAPIXELS_HL", "camerapixels-hl"),
    VIDEOPIXELS_HL("VIDEOPIXELS_HL", "videopixels-hl"),
    RAMSIZE_HL("RAMSIZE_HL", "ramsize-hl"),
    CHIPSET_HL("CHIPSET_HL", "chipset-hl"),
    BATSIZE_HL("BATSIZE_HL", "batsize-hl"),
    BATTYPE_HL("BATTYPE_HL", "battype-hl"),
    NETTECH("NETTECH", "nettech"),
    NET2G("NET2G", "net2g"),
    NET3G("NET3G", "net3g"),
    NET4G("NET4G", "net4g"),
    NET5G("NET5G", "net5g"),
    SPEED("SPEED", "speed"),
    YEAR("YEAR", "year"),
    STATUS("STATUS", "status"),
    DIMENSIONS("DIMENSIONS", "dimensions"),
    WEIGHT("WEIGHT", "weight"),
    BUILD("BUILD", "build"),
    SIM("SIM", "sim"),
    BODYOTHER("BODYOTHER", "bodyother"),
    DISPLAYTYPE("DISPLAYTYPE", "displaytype"),
    DISPLAYSIZE("DISPLAYSIZE", "displaysize"),
    DISPLAYRESOLUTION("DISPLAYRESOLUTION", "displayresolution"),
    DISPLAYPROTECTION("DISPLAYPROTECTION", "displayprotection"),
    OS("OS", "os"),
    CHIPSET("CHIPSET", "chipset"),
    CPU("CPU", "cpu"),
    GPU("GPU", "gpu"),
    MEMORYSLOT("MEMORYSLOT", "memoryslot"),
    INTERNALMEMORY("INTERNALMEMORY", "internalmemory"),
    MEMORYOTHER("MEMORYOTHER", "memoryother"),
    CAM1MODULES("CAM1MODULES", "cam1modules"),
    CAM1FEATURES("CAM1FEATURES", "cam1features"),
    CAM1VIDEO("CAM1VIDEO", "cam1video"),
    CAM2MODULES("CAM2MODULES", "cam2modules"),
    CAM2FEATURES("CAM2FEATURES", "cam2features"),
    CAM2VIDEO("CAM2VIDEO", "cam2video"),
    OPTIONALOTHER("OPTIONALOTHER", "optionalother"),
    WLAN("WLAN", "wlan"),
    BLUETOOTH("BLUETOOTH", "bluetooth"),
    GPS("GPS", "gps"),
    NFC("NFC", "nfc"),
    RADIO("RADIO", "radio"),
    USB("USB", "usb"),
    SENSORS("SENSORS", "sensors"),
    BATDESCRIPTION1("BATDESCRIPTION1", "batdescription1"),
    COLORS("COLORS", "colors"),
    MODELS("MODELS", "models"),
    SAR_US("SAR_US", "sar-us"),
    SAR_EU("SAR_EU", "sar-eu"),
    PRICE("Price", "price"),
    TBENCH("TBENCH", "tbench"),
    BATLIFE("BATLIFE", "batlife"),
    COMMENT("Comment", "comment"),
    URL("Url", "url");

    private final String name;
    private final String value;

    PhoneDetailType(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public static PhoneDetailType fromText(String text) {
        for (PhoneDetailType detail : PhoneDetailType.values()) {
            if (detail.getValue().equals(text)) {
                return detail;
            }
        }

        throw new RuntimeException(String.format("PhoneDetailType for '%s' not found.", text));
    }

    public static String[] getAllNames() {
        return Arrays
                .stream(values())
                .map(PhoneDetailType::getName)
                .toArray(String[]::new);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
