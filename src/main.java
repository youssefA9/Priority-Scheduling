import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        PriorityScheduling p=new PriorityScheduling();
      /*  int NumOfProcesses=0;
        Process newProcess;
        Scanner s=new Scanner(System.in);
        Scanner m=new Scanner(System.in);
        System.out.println("============== PRIORITY SCHEDULING ==============");
        System.out.println("Enter number of processes..");
        NumOfProcesses=s.nextInt();
        List<Process> prs=new ArrayList<>();
        for(int i=0;i<NumOfProcesses;i++){
            newProcess=new Process();
            System.out.println("Enter name of process "+(i+1)+" : ..");
            newProcess.setName(m.nextLine());
            System.out.println("Enter arrival time of process "+(i+1)+" : ..");
            newProcess.setArrivalTime(s.nextInt());
            System.out.println("Enter burst time of process "+(i+1)+" : ..");
            newProcess.setBurstTime(s.nextInt());
            System.out.println("Enter priority of process "+(i+1)+" : ..");
            newProcess.setPriority(s.nextInt());
            prs.add(newProcess);
        }*/
        List<Process> prs=new ArrayList<>();
        prs.add(new Process("p1",0,10,3));
        prs.add(new Process("p2",0,1,1));
        prs.add(new Process("p3",0,2,4));
        prs.add(new Process("p4",0,1,5));
        prs.add(new Process("p5",0,5,2));
        List<Integer>tempbusrt=new ArrayList<>();
        for(int i=0;i<prs.size();i++){
            tempbusrt.add(prs.get(i).getBurstTime());
        }
        p.setProcesses(prs);
        p.setBurst(tempbusrt);
        p.run();
        p.print();


    }
}
