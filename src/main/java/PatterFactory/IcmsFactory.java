package PatterFactory;

public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorEstado(String nomeEstado){
        if(nomeEstado.equalsIgnoreCase("ÏCMS_MG")){
            return new IcmsMG();
        }else if (nomeEstado.equalsIgnoreCase("ÏCMS_SP")) {
            return new IcmsSP();
        }else{
            System.out.println("Valor inválido - ICMS não cadastrado");
            return null;
        }
    }
}
