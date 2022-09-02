public class veiculo {
    private int ano;
    private int peso;

    public veiculo() {
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int obterClasse() {
        if (this.ano <= 1970) {
            if (this.peso < 1200) {
                return 1;
            } else {
                return this.peso <= 1700 ? 2 : 3;
            }
        } else if (this.ano <= 1979) {
            if (this.peso < 1200) {
                return 4;
            } else {
                return this.peso <= 1700 ? 5 : 6;
            }
        } else {
            return this.peso < 1600 ? 7 : 8;
        }
    }

    public float obterTaxa() {
        if (this.ano <= 1970) {
            if (this.peso < 1200) {
                return 16.5F;
            } else {
                return this.peso <= 1700 ? 25.5F : 46.5F;
            }
        } else if (this.ano <= 1979) {
            if (this.peso < 1200) {
                return 27.0F;
            } else {
                return this.peso <= 1700 ? 30.5F : 52.5F;
            }
        } else {
            return this.peso < 1600 ? 19.5F : 55.5F;
        }
    }
}