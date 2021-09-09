public class CellularAutomata {
    private int strength;
    private int x;
    private int y;
    private int id;

    public CellularAutomata(){
        this(0,0,0,0);
    }

    public CellularAutomata(int strength, int id, int x, int y){
        this.strength = strength;
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public void interactNeighbors(ArrayList<Cell>){

    }
}
