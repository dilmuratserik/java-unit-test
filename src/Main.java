import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
    private String liquidType;
    private double percentFull;
    public Main(String liquidType,double percentFull){
        this.liquidType = liquidType;
        this.percentFull = percentFull;
    }
    public String getLiquidType(){
        return liquidType;

    }
    public void setLiquidType(String liquidType){
        this.liquidType = liquidType;
    }
    public double getPercentFull(){
        return percentFull;
    }
    public void setPercentFull(double percentFull){
        this.percentFull =percentFull;
    }
}