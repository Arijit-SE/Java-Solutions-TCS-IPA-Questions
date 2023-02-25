package IPA6;
import java.util.*;
public class IPA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RRT[] r = new RRT[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            r[i]=new RRT(a,b,c,d,e);
        }
        String pro = sc.nextLine();
        RRT ans = getHighestPriorityTicket(r,pro);
        if(ans!=null)
        {
            System.out.println(ans.getTicketNo());
            System.out.println(ans.getRaisedBy());
            System.out.println(ans.getAssignedTo());
        }
        else
        {
            System.out.println("No such ticket.");
        }
    }
    public static RRT getHighestPriorityTicket(RRT[]rt, String p)
    {
        RRT[] r = new RRT[0];
        for (int i = 0; i < rt.length; i++) {
            if(rt[i].getProject().equalsIgnoreCase(p))
            {
                r = Arrays.copyOf(r,r.length+1);
                r[r.length-1]=rt[i];
            }
        }
        for(int i=0; i<r.length; i++)
        {
            {
                for (int j = i+1; j < r.length; j++) {
                    if(r[i].getPriority()>r[j].getPriority())
                    {
                        RRT max = r[i];
                        r[i]=r[j];
                        r[j]=max;
                    }
                }
            }
        }
        if(r.length>0)
        {
            return r[0];
        }
        else{
            return null;
        }
    }
}
class RRT
{
    private int ticketNo, priority;
    private String raisedBy, assignedTo, project;
    public RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project)
    {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }
    public int getTicketNo()
    {
        return ticketNo;
    }
    public void setTicketNo(int ticketNo)
    {
        this.ticketNo = ticketNo;
    }
    public String getRaisedBy()
    {
        return raisedBy;
    }
    public void setRaisedBy(String raisedBy)
    {
        this.raisedBy = raisedBy;
    }
    public String getAssignedTo()
    {
        return assignedTo;
    }
    public void setAssignedTo(String assignedTo)
    {
        this.assignedTo = assignedTo;
    }
    public int getPriority()
    {
        return priority;
    }
    public void setPriority(int priority)
    {
        this.priority = priority;
    }
    public String getProject()
    {
        return project;
    }
    public void setProject(String project)
    {
        this.project = project;
    }
}