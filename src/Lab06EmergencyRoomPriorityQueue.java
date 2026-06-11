import java.util.Scanner;

public class Lab06EmergencyRoomPriorityQueue {
    public static void printHeader() {
        System.out.println("Welcome to the Emergency Room Patient Admittance Menu System");
        System.out.println("Author: Group 1");
        System.out.println("Select an Option:");
    }

    public static void printMenu() {
        System.out.println("1. Push a Patient on the priority queue");
        System.out.println("2. Peek at a Patient on the priority queue");
        System.out.println("3. Pop a Patient from the priority queue");
        System.out.println("4. Check if the priority queue is empty");
        System.out.println("5. Get the size of the priority queue");
        System.out.println("6. Print the contents of the priority queue");
        System.out.println("7. Print just the names of the patients in the priority queue");
        System.out.println("8. Quit");

        System.out.print("Enter your choice: ");
    }
    public static void main (String[] args){
        Scanner myScan = new Scanner(System.in);
        PriorityQueue<Patient> pq = new PriorityQueue<Patient>();
        boolean quit = false;

        do{
            printHeader();
            printMenu();
            int readInput = Integer.parseInt(myScan.nextLine());

            switch(readInput){
                case 1:
                    System.out.print("Enter a patient name: ");
                    String name = myScan.nextLine();
                    System.out.print("Enter an Ailment Code: ");
                    String code = myScan.nextLine();
                    System.out.print("Enter a time stamp: ");
                    String time = myScan.nextLine();
                    Patient newPatient = new Patient(name, code, time);
                    pq.push(newPatient);
                    System.out.println("'" + name + "' added to the priority queue");
                    break;
                case 2:
                    if(pq.isEmpty()){
                        System.out.println("Nothing to see here: the priority queue is empty");
                    }else{
                        System.out.println("At the front of the priority queue: " + pq.peek());
                    }
                    break;
                case 3:
                    if(pq.isEmpty()){
                        System.out.println("Nothing to pop: the priority queue is empty");
                    }else{
                        System.out.println("At the front of the priority queue: " + pq.peek());
                    }
                    break;
                case 4:
                    if(pq.isEmpty()){
                        System.out.println("The priority queue is empty");
                    }else{
                        System.out.println("The priority queue is not empty");
                    }

                    break;
                case 5:
                    if(pq.isEmpty()){
                        System.out.println("Priority Queue size: 0");
                    }else{
                        System.out.println("Queue size: " + pq.getSize());
                    }
                    break;
                case 6:
                    if(pq.isEmpty()){
                        System.out.println("Nothing to print: the priority queue is empty");
                    }else{
                        pq.print();
                    }
                    break;
                case 7:
                    if(pq.isEmpty()){
                        System.out.println("Nothing to print: the priority queue is empty");
                    }else{
                        pq.printJustNames();
                    }
                    break;
                case 8:
                    System.out.println("You entered choice " + readInput + ": quit");
                    System.out.print("Are you sure you want to quit [Y/N]: ");

                    String quitInput = myScan.nextLine();

                    if (quitInput.charAt(0) == 'Y'||quitInput.charAt(0) == 'y') {
                        quit = true;
                        System.out.println("Goodbye!");
                    }
                    break;
                case 99:

                    break;

                default:

            }

        }while(!quit);
    }
}
