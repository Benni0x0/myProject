public class Analyse {

    public static void Analyse(){

    }

    //Handelt es sich um ein Produkt der VSE NET ?
    public static void firstAnalyse (String incoming_code){
        if (incoming_code.charAt(0) != '/'){
            Controller.product_VSENET = true;
        }
    }

    public static String WhiteLablePartner(String incoming_code){
        String partner = incoming_code.substring(incoming_code.indexOf('-')+1, incoming_code.length());
        partner = partner.substring(0, partner.indexOf('-'));
        return partner;
    }

    //Wird eine fixe-IP für bei dem Arktikelcode benötigt ?
    public static boolean ip_required (String incoming_code){
        if (incoming_code.contains("FIX")){
            return true;
        }
        else{
            return false;
        }
    }
}
