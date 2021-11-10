package Carta;

public class Naipe implements INaipe {
    private int n;
    private int p;

    public Naipe(int n, int p) {
        this.n = n;
        this.p = p;
    }
    
    public int getCarta() {
        return n;
    }

    public int getPalo() {
        return p;
    }

    @Override
    public int puntCarta() {
        switch (n) {
            case 1:
                return 11;
            case 3:
                return 10;
            case 12:
                return 4;
            case 11:
                return 3;
            case 10:
                return 2;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        String f = "[";
        switch (n) {
            case AS:
                f += "AS";
                break;
            case SOTA:
                f += "SOTA";
                break;
            case CABALLO:
                f += "CABALLO";
                break;
            case REY:
                f += "REY";
                break;
            default:
                f += n;
        }

        switch (p) {
            case OROS:
                f += " de OROS]";
                break;
            case BASTOS:
                f += " de BASTOS]";
                break;
            case COPAS:
                f += " de COPAS]";
                break;
            case ESPADAS:
                f += " de ESPADAS]";
                break;
        }
        return f;

    }

}
