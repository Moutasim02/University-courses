package com.structured_programming_SWE201.Chapter6.Testing;

import java.util.*;
class Product{
        String pid;
        String pname;
        double price;
        String dept;
        public Product(String pid, String pname, double price, String dept) {
                super();
                this.pid = pid;
                this.pname = pname;
                this.price = price;
                this.dept = dept;
        }
        public String getPid() {
                return pid;
        }
        public void setPid(String pid) {
                this.pid = pid;
        }
        public String getPname() {
                return pname;
        }
        public void setPname(String pname) {
                this.pname = pname;
        }
        public double getPrice() {
                return price;
        }
        public void setPrice(double price) {
                this.price = price;
        }
        public String getDept() {
                return dept;
        }
        public void setDept(String dept) {
                this.dept = dept;
        }
        
                
}
public class Test {

        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                Product p[] = new Product[21];
                p[0] = new Product("P201","Ralph Gown",50000,"Clothes");
                p[1] = new Product("P100","Lee Tshirt",1000,"Clothes");
                p[2] = new Product("P101","Lee Jeans",1500,"Clothes");
                p[3] = new Product("P102","Wrogn Top",1900,"Clothes");
                p[4] = new Product("P103","Roadster Shirt",800,"Clothes");
                p[5] = new Product("P104","Philips Curler",1500,"Electrical");
                p[6] = new Product("P105","Philips Trimmer",1000,"Electrical");
                p[7] = new Product("P106","Panasonic Spike",500,"Electrical");
                p[8] = new Product("P107","Tropicana 500ml",200,"Food");
                p[9] = new Product("P108","Noodles Pack",20,"Food");
                p[10] = new Product("P109","Rice 1kg Pack",50,"Food");
                p[11] = new Product("P110","Flour 1kg Pack",50,"Food");
                p[12] = new Product("P111","Wheat 1kg Pack",30,"Food");
                p[13] = new Product("P112","Toothpaste",30,"Grocery");
                p[14] = new Product("P113","Washing Powder",100,"Grocery");
                p[15] = new Product("P114","DishWashing Gel",300,"Grocery");
                p[16] = new Product("P115","Forever21 Dress",1000,"Clothes");
                p[17] = new Product("P116","Denim Pants",1000,"Clothes");
                p[18] = new Product("P117","Bread",20,"Bakery");
                p[19] = new Product("P118","Cake",450,"Bakery");
                p[20] = new Product("P119","Pastry",45,"Bakery");
                int choice;
                double sum = 0;
                ArrayList<String> l = new ArrayList<String>();
                while(true){
                        System.out.println("Select an item:\n1.Clothes\n2.Electrical\n3.Food\n4.Grocery\n5.Bakery\n6.Quit");
                        choice = s.nextInt();
                        s.nextLine();
                        if(choice==6)
                                break;
                        else if(choice==1){
                                System.out.println("Product ID\tProduct Name\t\tProduct Price");
                                for(int i=0;i<p.length;i++){
                                        if(p[i].getDept().equals("Clothes")){
                                                System.out.println(p[i].getPid()+"\t\t"+p[i].getPname()+"\t\t"+p[i].getPrice());
                                        }
                                }
                                while(true){
                                        System.out.println("Enter the Product ID: or Press 0 to go to main menu");
                                        String id = s.nextLine();
                                        if(id.equals("0"))
                                                break;
                                        l.add(id);
                                }
                        }
                        else if(choice==2){
                                System.out.println("Product ID\tProduct Name\t\tProduct Price");
                                for(int i=0;i<p.length;i++){
                                        if(p[i].getDept().equals("Electrical")){
                                                System.out.println(p[i].getPid()+"\t\t"+p[i].getPname()+"\t\t"+p[i].getPrice());
                                        }
                                }
                                while(true){
                                        System.out.println("Enter the Product ID: or Press 0 to go to main menu");
                                        String id = s.nextLine();
                                        if(id.equals("0"))
                                                break;
                                        l.add(id);
                                }
                        }
                        else if(choice==3){
                                System.out.println("Product ID\tProduct Name\t\tProduct Price");
                                for(int i=0;i<p.length;i++){
                                        if(p[i].getDept().equals("Food")){
                                                System.out.println(p[i].getPid()+"\t\t"+p[i].getPname()+"\t\t"+p[i].getPrice());
                                        }
                                }
                                while(true){
                                        System.out.println("Enter the Product ID: or Press 0 to go to main menu");
                                        String id = s.nextLine();
                                        if(id.equals("0"))
                                                break;
                                        l.add(id);
                                }
                                
                        }
                        else if(choice==4){
                                System.out.println("Product ID\tProduct Name\t\tProduct Price");
                                for(int i=0;i<p.length;i++){
                                        if(p[i].getDept().equals("Grocery")){
                                                System.out.println(p[i].getPid()+"\t\t"+p[i].getPname()+"\t\t"+p[i].getPrice());
                                        }
                                }
                                while(true){
                                        System.out.println("Enter the Product ID: or Press 0 to go to main menu");
                                        String id = s.nextLine();
                                        if(id.equals("0"))
                                                break;
                                        l.add(id);
                                }
                        }
                        else if(choice==5){
                                System.out.println("Product ID\tProduct Name\tProduct Price");
                                for(int i=0;i<p.length;i++){
                                        if(p[i].getDept().equals("Bakery")){
                                                System.out.println(p[i].getPid()+"\t\t"+p[i].getPname()+"\t\t"+p[i].getPrice());
                                        }
                                }
                                while(true){
                                        System.out.println("Enter the Product ID: or Press 0 to go to main menu");
                                        String id = s.nextLine();
                                        if(id.equals("0"))
                                                break;
                                        l.add(id);
                                }
                        }
                        
                        
                }
                System.out.println("***************BILLING**************");
                
                for(int i=0;i<p.length;i++){
                        for(int j=0;j<l.size();j++){
                                if(p[i].getPid().equals(l.get(j))){
                                        System.out.println(p[i].getPid()+"--------"+p[i].getPname()+"----------"+p[i].getPrice());
                                        sum = sum + p[i].getPrice();
                                }
                        }
                }
                System.out.println("Total = "+sum);
        }

}

