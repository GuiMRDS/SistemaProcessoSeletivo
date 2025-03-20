public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCantidado(1900.0);
        analisarCantidado(2200.0);
        analisarCantidado(2000.0);
    }
    static void analisarCantidado(double SalarioPermitido) {
        double SalarioBase = 2000.0;
        if(SalarioBase > SalarioPermitido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SalarioBase == SalarioPermitido) {
            System.out.println("AGUARDANDO O RESLTADO DOS DEAMIS CONDIDATOS");
        } else {
            System.out.println("AGUARDANDO O RESLTADO DOS DEAMIS CONDIDATOS");
        }
    }
}
