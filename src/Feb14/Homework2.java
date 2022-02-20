package Feb14;

public class Homework2 
{
	public static void main(String[] args) 
	{
		int batsmans = 0, bowlers = 0, fielders = 0, wicketkeeper = 0;
        String cricketer[] = 
        	{
                "ROHIT SHARMA BATSMAN",
                "ISHAN KISHAN BATSMAN",
                "VIRAT KHOLI BATSMAN",
                "MS DHONI WICKET KEEPER",
                "SHIKHAR DHAWAN BATSMAN",
                "RAVINDRA JADEJA ALL ROUNDER",
                "HARDIK PANDEYA ALL ROUNDER",
                "RAVICHANDRA ASHWIN BOWLER",
                "MOHAMMED SAMI BOWLER",
                "JASPREET BUMRAH BOWLER",
                "PRAGYAN OJHA BOWLER"
        };
        for (String player : cricketer) 
        {
            if (player.contains("BATSMAN")) batsmans++;
            if (player.contains("WICKET KEEPER")) wicketkeeper++;
            if (player.contains("BOWLER")) bowlers++;
            if (player.contains("ALL ROUNDER")) fielders++;
        }
        System.out.println("Total BATSMAN: " + batsmans);
        System.out.println("Total WICKET_KEEPER: " + wicketkeeper);
        System.out.println("Total BOWLER: " + bowlers);
        System.out.println("Total FIELDER: " + fielders);
    }
}