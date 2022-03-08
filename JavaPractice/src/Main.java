//Base Problem:
//       I have a car repair shop, and I want to keep track of my mechanics, cars being repaired and the status of the car (broken, repaired) and the car owners.
//        · I need to track customer names and addresses, and which car they own
//        · Customers can only have one car checked in at any given time
//        · When a car is checked in to the shop, a mechanic is assigned
//        · I need to track my mechanics individually, and each will have a unique name
//        · A mechanic can only be assigned to one car at any time
//        * If no mechanic is available, we reject the check in


import java.util.*;

interface CustomerInterface {

    public void display();

}
class CarService{
    public String CustomerID = "";
    public String MechanicID = "";
    public String carID = "";
    public String transactionID = "";

    void displayCustomerID(){

        System.out.println("Display Customer - Car Service");

    }
}
class Customer extends CarService implements CustomerInterface{
    private String CustomerName;
    private String CustomerID;

    public String getCustomerName() {
        return CustomerName;
    }

    void displayCustomerID(){

        System.out.println("Display Customer - Customer");

    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public Boolean getCarServiceInprogress() {
        return CarServiceInprogress;
    }

    public void setCarServiceInprogress(Boolean carServiceInprogress) {
        CarServiceInprogress = carServiceInprogress;
    }

    private String CustomerAddress;
    public Boolean CarServiceInprogress = false;

    CarService cs = new CarService();

    void CheckingOfCustomer(){

        if (this.CustomerID == cs.CustomerID){
            CarServiceInprogress = true;
        }else{
            CarServiceInprogress = false;
        }

    }

    public Customer(String customername, String customerid, String address ){
        this.CustomerID = customername;
        this.CustomerID = customerid;
        this.CustomerAddress = address;
       System.out.println(("Name:"+  CustomerName));
       System.out.println(("Customer ID:"+  CustomerID));
       System.out.println(("Address:"+  CustomerAddress));
    }

    public Customer(String customerid){
        this.CustomerID = customerid;

        System.out.println(("Customer ID:"+  CustomerID));

    }

    @Override
    public void display() {

    }
}
class Mechanic extends CarService {
    public String getMechanicID() {
        return MechanicID;
    }

    public void setMechanicID(String mechanicID) {
        MechanicID = mechanicID;
    }

    public String getMechanicName() {
        return MechanicName;
    }

    public void setMechanicName(String mechanicName) {
        MechanicName = mechanicName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Mechanic(String mechanicID, String mechanicName, boolean isAvailable) {
        MechanicID = mechanicID;
        MechanicName = mechanicName;
        this.isAvailable = isAvailable;
    }

    public void   setAvailable(boolean available) {
        isAvailable = available;
    }

    private String MechanicID;
    private String MechanicName;
    private boolean isAvailable = false;
    public static final String vari = "sample";

    CarService cs = new CarService();

    void CheckofMechanic(){
        if (this.MechanicID == cs.MechanicID){
            this.isAvailable = false;
        }else{
            this.isAvailable = true;

        }
    }

}

public class Main{

    public static void main (String[] args){

        enum LEVEL {
            SIMPLE,
            MEDIUM,
            HARD
        }

        Customer customer = new Customer("Arielle","1","Tondo, Manila");
        Customer customer2 = new Customer("2");
        Mechanic mechanic = new Mechanic("1", "Mech1",true);
        customer.displayCustomerID();

        CarService cs = new CarService();

        cs.CustomerID = customer.getCustomerID();

        cs.carID = "1";
        cs.transactionID = "1";
        if (mechanic.isAvailable() == true){
            cs.MechanicID = mechanic.getMechanicID();

        }else{

            //loop thru mechanic
        }

        // if no mechanic
        customer = null;

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

        List <String> list1= new ArrayList();
        List <String> list2 = new LinkedList();
        List <String> list3 = new Vector();
        List <String> list4 = new Stack();

        //Array List

        Hmap();

        arrayInt();

        int int1 = 2;
        int int2 = 2;

        //Only use == in primitive data types

        if (int1 == int2){
            System.out.println("The numbers are equal");

        }else{
            System.out.println("The numbers are not equal");
        }

        String s1 = new String("HELLO");
        String s2 = "HELLO";

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        // comparing two non-primitive data types
        if (s1 == s2){
            System.out.println("The Strings are equal");

        }else{
            System.out.println("The Strings are not equal");
        }

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= sc.nextLine();              //reads string
        System.out.print("You have entered: "+str);

        Scanner sc1= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc1.nextInt();
        System.out.print("Enter second number- ");
        int b= sc1.nextInt();
        System.out.print("Enter third number- ");
        int c= sc1.nextInt();
        int d=a+b+c;
        System.out.println("Total= " +d);

    }

    void ArList(){

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    static void Hmap(){

        ArrayList <String> listType = new ArrayList<String>();

        HashMap <String,CustomArrayList> orderList = new HashMap<String,CustomArrayList>();

        listType.add("Chicken");
        listType.add("Beef");
        listType.add("Pork");


        System.out.println(listType);

        orderList.put("1111", new CustomArrayList("meat", listType));
        listType.clear();

        listType.add("Chicken");
        listType.add("Beef");
        listType.add("Pork");
        System.out.println(listType);
        orderList.put("2222", new CustomArrayList("beef", listType));

        listType.clear();

        listType.add("Chicken");
        listType.add("Pork");

        System.out.println(listType);

        orderList.put("3333", new CustomArrayList("meat", listType));



//        // Getting an iterator
//        Iterator hmIterator = orderList.entrySet().iterator();
//
//        // Iterate through the hashmap
//        // and add some bonus marks for every student
//        System.out.println("HashMaps:");
//        while (hmIterator.hasNext()) {
//
//            Map.Entry mapElement = (Map.Entry)hmIterator.next();
//            CustomArrayList marks = ((CustomArrayList)mapElement.getValue());
//            System.out.println(mapElement.getKey() + " : " );
//
//            System.out.println("Elements: " );
//            for (int i = 0; i < marks.listType.size(); i++){
//
//                System.out.println(marks.listType.get(i));
//            }
//
//        }


//        System.out.println(orderList);
//        System.out.println(orderList.get("1111"));
//        System.out.println(orderList.containsKey("1111"));
//        System.out.println(orderList.containsValue("1234"));
//
//        System.out.println(orderList.containsValue("1234"));


        //Traversing map
        for(Map.Entry<String, CustomArrayList> entry:orderList.entrySet()){
            String key=entry.getKey();
            CustomArrayList b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.description + " "+b.listType);

             System.out.println("Elements: " );
//            for (int i = 0; i < b.listType.size(); i++){
//
//                System.out.println(b.listType.get(i));
//            }
          //  b.displayList();
        }

        // Max

        String str1 = "abcaaaaaaaabbb";
        System.out.println("The given string is: " + str1);
        System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));

    }

    boolean returnResult(int a){
        //even true
        //odd false

        if (a % 2 == 0) return true;
        return false;

    }

    void arrayChar(){

        char[] JavaCharArray = {'e', 'b', 'c', 'a', 'd'};
        Arrays.sort(JavaCharArray);
        System.out.println(Arrays.toString(JavaCharArray));

        String value = "JavaTPoint"; //Enter String
        //Convert string to a char array.
        char[] array = value.toCharArray(); // Conversion from string to character
        for(char c : array) //Iterating array values
        {
            System.out.println(c);
        }

        int[] ints = {1, 2, 3};
        List<Integer> intList = new ArrayList<Integer>(ints.length);
        for (int i : ints)
        {
            intList.add(i);
        }


    }

    static char MaxOccuringChar(String str1) {
        int N = 256;
        int ctr[] = new int[N];

        int l = str1.length();
        for (int i = 0; i < l; i++) {
            ctr[str1.charAt(i)]++;
            System.out.println(ctr[str1.charAt(i)] + " - " + str1.charAt(i));
        }
        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }

        return result;
    }

    static void arrayInt(){

        int[] JavaCharArray = {5,4,12,23,1};
        Arrays.sort(JavaCharArray);
        System.out.println(Arrays.toString(JavaCharArray));

    }

}


class CustomArrayList{

    String description;
    ArrayList <String> listType = new ArrayList<>();

    CustomArrayList(String description, ArrayList <String> listType){

        this.description = description;
        this.listType = listType;
    }

}
