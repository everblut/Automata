import java.util.Arrays;
import java.util.Random;

public class Regla30 {

    public static final Boolean[][] regla30 = 
    {
	{true,true,true},
	{true,true,false},
	{true,false,true},
	{true,false,false},
	{false,true,true},
	{false,true,false},
	{false,false,true},
	{false,false,false}
    };
    public static final Boolean[] resultadoRegla30 =
    {
	false,false,false,true,true,true,true,false
    };
   
    public static Boolean[][] primerPatron(Boolean[][] linea){
	Boolean flag;
	Random r = new Random();
	for(int x = 0; x < linea.length; x++){
	    flag = r.nextBoolean();
	    linea[x][0] = (flag==true)?true:false;
	}
	return linea;
    }
    
    public static Boolean[][] evalua(Boolean[][] area, int y){
	int size = Automata.SIZE_X;
	Boolean[] subArray = { area[size-1][y], area[0][y], area[1][y] };
	for(int x = 0; x < size; x++){
	    if(x == 0){
		area[x][y+1] = aplicaRegla(subArray);
	    }else if(x == size-1){
		subArray[0] = area[x-1][y];
		subArray[1] = area[x][y];
		subArray[2] = area[0][y];
		area[x][y+1] = aplicaRegla(subArray);
	    }else{
	    	subArray[0] = area[x-1][y];
	    	subArray[1] = area[x][y];
	    	subArray[2] = area[x+1][y];
		area[x][y+1] = aplicaRegla(subArray);
	    }
	}
	return area;
    }

    public static Boolean aplicaRegla(Boolean[] subArray){
	Boolean flag = false;
	for(int i = 0; i <= 7; i++){
	    flag = Arrays.equals(Regla30.regla30[i],subArray);
	    if(flag){
		return resultadoRegla30[i];
	    }
	}
	return false;
    }
}


