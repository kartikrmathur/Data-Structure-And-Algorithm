package OOPs.Methods;

class MethodsInJava {
    public int divideTwoNumber(int x, int y){
        int division =  x/y;
        return division;
    }

    public static void main(String[] args) {
     MethodsInJava Obj = new MethodsInJava();
     int Numbah1 = 4;
     int Numbah2 = 2;
     int result = Obj.divideTwoNumber(Numbah1,Numbah2);
     System.out.println("Numbah1:- "+Numbah1+" Numbah2:- "+Numbah2+" result:- "+result);
    }

}
