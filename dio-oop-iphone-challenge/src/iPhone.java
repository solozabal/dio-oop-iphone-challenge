public class iPhone {
    private final ReprodutorMusical reprodutorMusical;
    private final AparelhoTelefonico aparelhoTelefonico;
    private final NavegadorNaInternet navegadorNaInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorNaInternet = new NavegadorNaInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorNaInternet getNavegadorNaInternet() {
        return navegadorNaInternet;
    }
}
