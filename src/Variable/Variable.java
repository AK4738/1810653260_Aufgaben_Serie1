package Variable;

public class Variable
{
    private String BEZEICHNER;

    public static void main (String[] args)
    {
        String name;
        name = "Kadir";
        System.out.println("" + name);
        int age;
        age = 18;
        System.out.println(""+age);


        final String FH_KUFSTEIN_TIROL;//neue variable erstellt und als final definiert
         FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol"; //final wert zugewiesen (nicht mehr veränderbar)

        final String BEZEICHNER;

        System.out.println("JavaverwendetfürStrings\"doppelteAnführungszeichen\"undeinzelneAnführungszeichen\n" +
                "wie 'c' um einzelne Zeichen zu definieren.");

        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\");

        System.out.println("Ich verwende den\b Backspace, die Newline\n und den \tTabulator");

        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt\n" +
                "diebestehendeZeile.\fistinderKonsolenichtbemerkbar,daeseinenSeitenumbruch\n" +
                "erzwingt.");
    }
}
