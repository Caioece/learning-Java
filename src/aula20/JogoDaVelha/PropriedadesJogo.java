public class PropriedadesJogo {
    private boolean jogando;
    private int turn;
    private int ganhador;
    private int velha;
    private int rounds;
    private int jogar;
    private int validTurn;
    private int opcao;

    public PropriedadesJogo(){
        jogando = true;
        rounds = 0;
        velha = 0;
        ganhador = 0;
        jogar = 0;
        validTurn = 0;
    }
    public int getOpcao(){
        return opcao;
    }
    public void setOpcao(int opcao){
        this.opcao = opcao;
    }
    public int getValidTurn(){
        return validTurn;
    }
    public void setValidTurn(int validTurn){
        this.validTurn = validTurn;
    }
    public int getJogar(){
        return jogar;
    }
    public void setJogar(int jogar){
        this.jogar = jogar;
    }
    public boolean getJogando(){
        return jogando;
    }
    public void setJogando(boolean jogando){
        this.jogando = jogando;
    }
    public int getTurn(){
        return turn;
    }
    public void setTurn(int turn){
        this.turn = turn;
    }
    public int getGanhador(){
        return ganhador;
    }
    public void setGanhador(int turn){
        this.ganhador = turn;
    }
    public int getVelha(){
        return velha;
    }
    public void setVelha(int velha){
        this.velha = velha;
    }
    public int getRounds(){
        return rounds;
    }
    public void increaseRounds(){
        this.rounds+=1;
    }
}