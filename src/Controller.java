public class Controller {

    public static Analyse analyse;
    static boolean product_VSENET = false;

    public static void Controller(){
        analyse = new Analyse();
    }

    public static void start(){
        String partner= new String();

        String incoming_code ="/WLP-AVACON-B0820/FIX/";
        analyse.firstAnalyse(incoming_code);

        if (!product_VSENET){
            if (!analyse.ip_required(incoming_code)){
                System.out.println("Es wird keine fixe-IP bei dem Kunden benötigt.\n" +
                        "Der Vorgang wird beendet");
            }
            else{
                partner= analyse.WhiteLablePartner(incoming_code);
                switch (partner){
                    case "AVACON":
                        System.out.println("Avavon");
                        break;
                    case "EDG":
                        break;
                    case "EWG":
                        break;
                    case "EWR":
                        break;
                    case "Primero.com":
                        break;
                    case "Telsakom":
                        break;
                    default:
                        System.out.println("Es ist ein Fehler aufgetreten. Es konnte kein White Label Partner zugerodert werden");

                }
            }


        }

        System.out.println(partner);
    }
}
