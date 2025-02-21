
package modelo;

public class TanqueRobo implements Cor, Canhao, Posicao{

    private int x,y;
    private CoresRGB corTanque, corCanhao;
    
      public TanqueRobo(int x, int y, CoresRGB corTanque, CoresRGB corCanhao) {
        this.x = x;
        this.y = y;
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
    }
      
    @Override
    public void atirar() {
        for (int i=1; i<=5;i++){
            System.out.println("Atirando...");
        }
    }

    @Override
    public void atirar(long cadencia) {
         for (int i=1; i<=5;i++){
            System.out.println("Atirando...");
            esperar(cadencia);
        }
    }

    private void esperar(long cadencia){
        try {
            if (cadencia >5){
                throw new IllegalArgumentException("Valor invalido");
            }
             Thread.sleep(cadencia*1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
    }
            
    @Override
    public void movLeste() {
        x++;
    }

    @Override
    public void movOeste() {
        x--;
    }

    @Override
    public void movNorte() {
        y++;
    }

    @Override
    public void movSul() {
        y--;
    }

    @Override
    public int retPosicaoX() {
        return x;
    }

    @Override
    public int retPosicaoY() {
        return y;
    }

    @Override
    public void atribCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public CoresRGB retCorTanque() {
        return corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
        return corCanhao;
    }

    @Override
    public String toString() {
        return "TanqueRobo{" + "x=" + x + ", y=" + y 
                + ", corTanque=" + corTanque + ", corCanhao=" 
                + corCanhao + '}';
    }
    
}
