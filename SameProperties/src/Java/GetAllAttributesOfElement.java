package Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.io.File;


public class GetAllAttributesOfElement {
    WebDriver w;
    String filelocation = System.getProperty("user.dir");
    int Countries_count = 1;
    String[] Countries_Name = {"ALBANIA", "ALGERIA", "AMERICAN SAMOA", "ANDORRA", "ANGOLA", "ANGUILLA", "ANTARCTICA", "ANTIGUA AND BARBUDA", "ARGENTINA", "ARMENIA",
            "ARUBA", "ASHMORE AND CARTIER ISLANDS", "AUSTRALIA", "AUSTRIA", "AZERBAIJAN", "BAHAMAS", "BAHRAIN", "BAKER ISLAND", "BANGLADESH", "BARBADOS",
            "BASSA DE INDIA", "BELARUS", "BELGIUM", "BELIZE", "BENIN", "BERMUDA", "BHUTAN", "BOLIVIA", "BOSNIA AND HERZEGOVINA", "BOTSWANA", "BOUVET ISLAND",
            "BRAZIL", "BRITISH INDIAN OCEAN TERRITORY", "BRITISH VIRGIN ISLANDS", "BRUNEI", "BULGARIA", "BURKINA FASO", "BURMA", "BURUNDI", "CAMBODIA",
            "CAMEROON", "CANADA", "CAPE VERDE", "CAYMAN ISLANDS", "CENTRAL AFRICAN REPUBLIC", "CHAD", "CHILE", "CHINA", "CHRISTMAS ISLAND", "CLIPPERTON ISLAND",
            "COCOS (KEELING) ISLANDS", "COLOMBIA", "COMOROS", "CONGO", "COOK ISLANDS", "CORAL SEA ISLANDS", "COSTA RICA", "COTE D'IVOIRE", "CROATIA",
            "CUBA", "CYPRUS", "CZECH REPUBLIC", "DENMARK", "DJIBOUTI", "DOMINICA", "DOMINICAN REPUBLIC", "ECUADOR", "EGYPT", "EL SALVADOR", "EQUATORIAL GUINEA",
            "ERITREA", "ESTONIA", "ETHIOPIA", "EUROPA ISLAND", "FALKLAND ISLANDS", "FAROE ISLANDS", "FIJI", "FINLAND", "FRANCE", "FRENCH GUIANA", "FRENCH POLYNESIA",
            "FRENCH SOUTHERN AND ANTARCTIC LANDS", "GABON", "GAMBIA", "GAZA STRIP", "GEORGIA", "GERMANY", "GHANA", "GIBRALTAR", "GLORIOSO ISLANDS",
            "GREECE", "GREENLAND", "GRENADA", "GUADELOUPE", "GUAM", "GUATEMALA", "GUERNSEY", "GUINEA", "GUINEA-BISSAU", "GUYANA", "HAITI",
            "HEARD ISLAND AND MCDONALD ISLANDS", "HONDURAS", "HONG KONG", "HOWLAND ISLAND", "HUNGARY", "ICELAND", "INDIA", "INDONESIA", "IRAN", "IRAQ",
            "IRELAND", "ISRAEL", "ITALY", "JAMAICA", "JAN MAYEN", "JAPAN", "JARVIS ISLAND", "JERSEY", "JOHNSTON ATOLL", "JORDAN", "JUAN DE NOVA ISLAND", "KAZAKHSTAN",
            "KENYA", "KINGMAN REEF", "KIRIBATI", "KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF", "KOREA, REPUBLIC OF", "KUWAIT", "KYRGYZSTAN", "LAOS", "LATVIA", "LEBANON",
            "LESOTHO", "LIBERIA", "LIBYA", "LIECHTENSTEIN", "LITHUANIA", "LUXEMBOURG", "MACAU", "MACEDONIA, FORMER REPUBLIC OF", "MADAGASCAR", "MALAWI", "MALAYSIA",
            "MALDIVES", "MALI", "MALTA", "MAN, ISLE OF", "MARSHALL ISLANDS", "MARTINIQUE", "MAURITANIA", "MAURITIUS", "MAYOTTE", "MEXICO", "MICRONESIA", "MIDWAY ISLANDS",
            "MOLDOVA", "MONACO", "MONGOLIA", "MONTENEGRO", "MONTSERRAT", "MOROCCO", "MOZAMBIQUE", "NAMIBIA", "NAURU", "NAVASSA ISLAND", "NEPAL", "NETHERLANDS",
            "NETHERLANDS ANTILLES", "NEW CALEDONIA", "NEW ZEALAND", "NICARAGUA", "NIGER", "NIGERIA", "NIUE", "NO MANS LAND", "NORFOLK ISLAND", "NORTHERN MARIANA ISLANDS",
            "NORWAY", "OCEANS", "OMAN", "PALMYRA ATOLL", "PANAMA", "PAPUA NEW GUINEA", "PARACEL ISLANDS", "PARAGUAY", "PERU", "PHILIPPINES", "PITCAIRN ISLANDS", "POLAND",
            "PORTUGAL", "PUERTO RICO", "QATAR", "REUNION", "ROMANIA", "RUSSIA", "RWANDA", "SAN MARINO", "SAO TOME AND PRINCIPE", "SAUDI ARABIA", "SENEGAL", "SERBIA", "SEYCHELLES",
            "SIERRA LEONE", "SINGAPORE", "SLOVAKIA", "SLOVENIA", "SOLOMON ISLANDS", "SOMALIA", "SOUTH AFRICA", "SOVIET UNION", "SPAIN", "SPRATLY ISLANDS", "SRI LANKA",
            "ST. HELENA", "ST. KITTS AND NEVIS", "ST. LUCIA", "ST. PIERRE AND MIQUELON", "ST. VINCENT AND THE GRENADINES", "SUDAN", "SURINAME", "SVALBARD", "SWAZILAND",
            "SWEDEN", "SWITZERLAND", "SYRIA", "TAIWAN", "TAJIKISTAN", "TANZANIA, UNITED REPUBLIC OF", "THAILAND", "TOGO", "TOKELAU", "TONGA", "TRINIDAD AND TOBAGO",
            "TROMELIN ISLAND", "TUNISIA", "TURKEY", "TURKMENISTAN", "TURKS AND CAICOS ISLANDS", "TUVALU", "UGANDA", "UKRAINE", "UNDERSEA FEATURES", "UNITED ARAB EMIRATES",
            "UNITED KINGDOM", "UNITED STATES", "URUGUAY", "UZBEKISTAN", "VANUATU", "VATICAN CITY", "VENEZUELA", "VIETNAM", "VIRGIN ISLANDS", "WAKE ISLAND",
            "WALLIS AND FUTUNA", "WEST BANK", "WESTERN SAHARA", "WESTERN SAMOA", "YEMEN", "YUGOSLAVIA", "ZAIRE", "ZAMBIA", "ZIMBABWE"};


    @Test
    public void GetAllAttributesOf_Element() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        String URL = filelocation + File.separator + "Docs_files" + File.separator + "HtmlCssJs" + File.separator + "DropDownToggles.html";

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver(capabilities);
        w.manage().window().maximize();
        w.navigate().to(URL);
        w.manage().deleteAllCookies();
        Thread.sleep(3000);

        int SelectNoCount = w.findElements(By.xpath("//html/body/div[*]")).size();
        int SelectNo = 1, SelectElement;

        for (SelectNo = 1; SelectNo <= SelectNoCount; SelectNo += 2) {
            w.findElement(By.xpath("//html/body/div[" + SelectNo + "]/span[2]")).click();
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) w;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            Thread.sleep(2000);
            int SelectNoElementCount = w.findElements(By.xpath("//html/body/div[" + (SelectNo + 1) + "]/input")).size();
            for (SelectElement = 1; SelectElement <= SelectNoElementCount; SelectElement++) {
                w.findElement(By.xpath("//html/body/div[" + (SelectNo + 1) + "]/input[" + SelectElement + "]")).sendKeys("" + Countries_Name[Countries_count]);
                Countries_count++;
            }
        }
        Thread.sleep(5000);
        w.close();

    }
}
