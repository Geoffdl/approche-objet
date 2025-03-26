package fr.diginamic.entites;

public class Theatre
{
    private String name;
    private int capacity;
    private int clientsRegistered;
    private double revenue;

    public Theatre(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
        this.clientsRegistered = 0;
        this.revenue = 0.0;
    }

    public void register(int clients, double seatPrice)
    {

        if (clientsRegistered + clients > capacity)
        {
            System.out.println("Cannot register " + clients + " clients. Only " +
                    (capacity - clientsRegistered) + " seats remaining.");
            return;
        }

        clientsRegistered += clients;
        revenue += clients * seatPrice;

        System.out.println("Registered " + clients + " clients at " + seatPrice + "€ per seat");
        System.out.println("Total clients: " + clientsRegistered + "/" + capacity);
        System.out.println("Total revenue: " + revenue + "€");
    }


    public String getName()
    {
        return name;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getClientsRegistered()
    {
        return clientsRegistered;
    }

    public double getRevenue()
    {
        return revenue;
    }
}