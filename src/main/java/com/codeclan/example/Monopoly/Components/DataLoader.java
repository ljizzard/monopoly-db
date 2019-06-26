package com.codeclan.example.Monopoly.Components;

import com.codeclan.example.Monopoly.models.Cards;
import com.codeclan.example.Monopoly.models.Squares;
import com.codeclan.example.Monopoly.repositories.CardsRepository;
import com.codeclan.example.Monopoly.repositories.SquaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DataLoader  implements ApplicationRunner {

    @Autowired
    SquaresRepository squaresRepository;

    @Autowired
    CardsRepository cardsRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Squares go = new Squares(0,"Go",null, 0, new ArrayList<Integer>(Arrays.asList (0, 0, 0, 0,0,0)), 0);
        squaresRepository.save(go);

        Squares okr = new Squares(1,"Old Kent Road", "brown",60, new ArrayList<Integer>(Arrays.asList(2, 10, 30, 90,160,250)), 50);
        squaresRepository.save(okr);

        Squares cc1 = new Squares(2, "Community Chest", "communitychest",0,new ArrayList<Integer>(Arrays.asList (0, 0, 0, 0, 0, 0)), 0);
        squaresRepository.save(cc1);

        Squares wr = new Squares(3,"Whitechapel Road", "brown", 60,new ArrayList<Integer>(Arrays.asList (4, 20, 60, 180, 320, 450)), 50);
        squaresRepository.save(wr);

        Squares it = new Squares(4, "Income Tax", "tax", 0, new ArrayList<Integer>(Arrays.asList (200, 0, 0, 0, 0, 0)), 0);
        squaresRepository.save(it);

        Squares kcs = new Squares(5, "Kings Cross Station", "station", 200,new ArrayList<Integer>(Arrays.asList (25,50,100,2000,0,0)), 0);
        squaresRepository.save(kcs);

        Squares tai = new Squares(6, "The Angel Islington", "lightblue", 100,new ArrayList<Integer>(Arrays.asList (6,30, 90,270,400,550)), 50);
        squaresRepository.save(tai);

        Squares c1 = new Squares(7, "Chance", "chance", 0,new ArrayList<Integer>(Arrays.asList (0,0 ,0 ,0 ,0 ,0)),0);
        squaresRepository.save(c1);

        Squares er = new Squares(8, "Euston Road", "lightblue", 100,new ArrayList<Integer>(Arrays.asList (6, 30,90,270,400,550)), 50);
        squaresRepository.save(er);

        Squares pv = new Squares(9, "Pentonville Road", "lightblue", 120,new ArrayList<Integer>(Arrays.asList (8, 40, 100, 300, 450, 600)), 50);
        squaresRepository.save(pv);

        Squares jail = new Squares( 10, "Jail", null, 0,new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0)),0);
        squaresRepository.save(jail);

        Squares pm = new Squares(11, "Pall Mall", "deeppink", 140,new ArrayList<Integer>(Arrays.asList(10, 50, 150, 450, 625, 750)),100);
        squaresRepository.save(pm);

        Squares ec = new Squares(12, "Electric Company", "utility", 150,new ArrayList<Integer>(Arrays.asList(4, 10, 0, 0, 0, 0)), 0);
        squaresRepository.save(ec);

        Squares w = new Squares(13, "Whitehall", "deeppink", 140,new ArrayList<Integer>(Arrays.asList(10,50,150,450,625, 750)),100);
        squaresRepository.save(w);

        Squares na = new Squares(14, "Northumberland Avenue", "deeppink", 160,new ArrayList<Integer>(Arrays.asList(12, 60, 180, 500, 700, 900)), 100);
        squaresRepository.save(na);

        Squares msta = new Squares(15, "Marylebone Station", "station", 200,new ArrayList<Integer>(Arrays.asList(25, 50, 100, 200, 0, 0)), 0 );
        squaresRepository.save(msta);

        Squares bs = new Squares(16, "Bow Street", "orange", 180,new ArrayList<Integer>(Arrays.asList(14, 70, 200, 550, 750, 950)), 100);
        squaresRepository.save(bs);

        Squares cc2 = new Squares(17, "Community Chest", "communitychest", 0,new ArrayList<Integer>(Arrays.asList(0,0, 0, 0, 0, 0)), 0);
        squaresRepository.save(cc2);

        Squares ms = new Squares(18, "Marlborough Street", "orange", 180,new ArrayList<Integer>(Arrays.asList(14, 70, 200, 550, 750, 950)),100);
        squaresRepository.save(ms);

        Squares vs = new Squares(19, "Vine Street", "orange",200,new ArrayList<Integer>(Arrays.asList(16, 80, 220, 600, 800, 1000)),100);
        squaresRepository.save(vs);

        Squares free = new Squares(20, "Free Parking", null, 0,new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0)), 0);
        squaresRepository.save(free);

        Squares s = new Squares(21, "Strand", "red", 220,new ArrayList<Integer>(Arrays.asList(18,90, 250,700, 875, 1050)), 150);
        squaresRepository.save(s);

        Squares c2 = new Squares(22, "Chance", "chance", 0,new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0)), 0);
        squaresRepository.save(c2);

        Squares fs = new Squares(23, "Fleet Street", "red", 220,new ArrayList<Integer>(Arrays.asList(18, 90, 250, 700, 875, 1050)), 150);
        squaresRepository.save(fs);

        Squares ts = new Squares(24, "Trafalgar Square", "red", 240,new ArrayList<Integer>(Arrays.asList (20, 100,300,750,925, 1100)),150);
        squaresRepository.save(ts);

        Squares fss = new Squares(25, "Fenchurch St. Station", "station", 200,new ArrayList<Integer>(Arrays.asList (25, 50, 100, 200, 0, 0)),0);
        squaresRepository.save(fss);

        Squares ls = new Squares(26, "Leicester Square", "yellow", 260,new ArrayList<Integer>(Arrays.asList(22, 110, 330,800,975,1150)),150 );
        squaresRepository.save(ls);

        Squares cs = new Squares(27, "Coventry Street", "yellow", 260,new ArrayList<Integer>(Arrays.asList(22, 110, 330, 800, 975, 1150)), 150);
        squaresRepository.save(cs);

        Squares ww = new Squares(28, "Water Works", "utility", 150,new ArrayList<Integer>(Arrays.asList(4, 10, 0, 0, 0, 0)), 0 );
        squaresRepository.save(ww);

        Squares p = new Squares(29, "Piccadilly", "yellow", 280,new ArrayList<Integer>(Arrays.asList(24, 120, 360, 850, 1025, 1200)), 150 );
        squaresRepository.save(p);

        Squares gtj = new Squares(30, "Go to Jail", null, 0,new ArrayList<Integer>(Arrays.asList(0,0,0,0, 0, 0)), 0);
        squaresRepository.save(gtj);

        Squares rs = new Squares(31, "Regent Street", "green", 300,new ArrayList<Integer>(Arrays.asList(26, 130, 390, 900, 1100, 1275)), 200 );
        squaresRepository.save(rs);

        Squares os = new Squares(32, "Oxford Street", "green", 300,new ArrayList<Integer>(Arrays.asList(26, 130, 390, 900, 1100, 1275)), 200);
        squaresRepository.save(os);

        Squares cc3 = new Squares(33, "Community Chest", "communitychest", 0,new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0)), 0 );
        squaresRepository.save(cc3);

        Squares bstr = new Squares(34, "Bond Street", "green", 320,new ArrayList<Integer>(Arrays.asList(28, 150, 450, 1000, 1200, 1400)), 200);
        squaresRepository.save(bstr);

        Squares lss = new Squares(35, "Liverpool St. Station", "station", 200, new ArrayList<Integer>(Arrays.asList(25, 50, 100, 200, 0, 0)), 0);
        squaresRepository.save(lss);

        Squares c3 = new Squares(36, "Chance", "chance", 0,new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0)), 0);
        squaresRepository.save(c3);

        Squares pl = new Squares(37, "Park Lane", "darkblue", 350,new ArrayList<Integer>(Arrays.asList(35, 175, 500, 1100, 1300, 1500)), 200);
        squaresRepository.save(pl);

        Squares st = new Squares(38, "Super Tax", "tax", 0,new ArrayList<Integer>(Arrays.asList(100, 0, 0, 0, 0, 0)), 0);
        squaresRepository.save(st);

        Squares m = new Squares(39, "Mayfair", "darkblue", 400,new ArrayList<Integer>(Arrays.asList(50, 200, 600, 1400, 1700, 2000)), 200);
        squaresRepository.save(m);
//


        Cards com1 = new Cards("Community Chest", "Bank error in your favour. Collect £200.", 1, 200);
        cardsRepository.save(com1);

        Cards com2 = new Cards("Community Chest", "Advance to Go.  Collect £200. ", 3, 0);
        cardsRepository.save(com2);

        Cards com3 = new Cards("Community Chest", "You have won second place in a beauty contest. Collect £10.", 1, 10);
        cardsRepository.save(com3);

        Cards com4 = new Cards("Community Chest", "Make general repairs on all your property: For each house, pay £25. For each hotel, pay £100.", 5, 25);
        cardsRepository.save(com4);

        Cards com5 = new Cards("Community Chest", "From sale of stock you get £50.", 1, 50);
        cardsRepository.save(com5);

        Cards com6 = new Cards("Community Chest", "You inherit £100.", 1, 100);
        cardsRepository.save(com6);

        Cards com7 = new Cards("Community Chest", "It is your birthday. Collect £10 from every player.", 9, 10);
        cardsRepository.save(com7);

        Cards com8 = new Cards("Community Chest", "Receive £25 consultancy fee.", 1, 25);
        cardsRepository.save(com8);

        Cards com9 = new Cards("Community Chest", "Hospital Fees. Pay £100.", 2, 100);
        cardsRepository.save(com9);

        Cards com10 = new Cards("Community Chest", "Income Tax refund. Collect £20.", 1, 20);
        cardsRepository.save(com10);

        Cards com11= new Cards("Community Chest", "School Fees. Pay £50.", 2, 50);
        cardsRepository.save(com11);

        Cards com12 = new Cards("Community Chest", "Life Insurance matures. Collect £100.", 1, 100);
        cardsRepository.save(com12);

        Cards com13 = new Cards("Community Chest", "Holiday Fund matures. Receive £100.", 1, 100);
        cardsRepository.save(com13);

        Cards com14 = new Cards("Community Chest", "Doctors Fee. pay £50.", 2, 50);
        cardsRepository.save(com14);

        Cards com15 = new Cards("Community Chest", "Go to Jail. Go directly to jail, do not pass go, do not collect £200.", 3, 10);
        cardsRepository.save(com15);

        Cards com16 = new Cards("Community Chest", "Get out of jail free. This card may be kept until needed or traded.", 4, 0);
        cardsRepository.save(com16);

        Cards chance1 = new Cards("Chance", "Get out of jail free. This card may be kept until needed or traded.", 4, 0);
        cardsRepository.save(chance1);

        Cards chance2 = new Cards("Chance", "Go to Jail. Go directly to jail, do not pass go, do not collect £200.", 3, 10);
        cardsRepository.save(chance2);

        Cards chance3 = new Cards("Chance", "Advance to Go. Collect £200.", 3, 0);
        cardsRepository.save(chance3);

        Cards chance4 = new Cards("Chance", "Go back 3 spaces.", 3, 3);
        cardsRepository.save(chance4);

        Cards chance5 = new Cards("Chance", "Bank pays you dividend of £50.", 1, 50);
        cardsRepository.save(chance5);

        Cards chance6 = new Cards("Chance", "Make general repairs on all your property: For each house, pay £25. For each hotel, pay £100 .", 5, 25);
        cardsRepository.save(chance6);

        Cards chance7 = new Cards("Chance", "Advance to Pall Mall.  If you pass Go, collect £200.", 3, 11);
        cardsRepository.save(chance7);

        Cards chance8 = new Cards("Chance", "You have been elected chairman of the board. Receive £50.", 1, 50);
        cardsRepository.save(chance8);

        Cards chance9 = new Cards("Chance", "Speeding Fine, pay £15.", 2, 15);
        cardsRepository.save(chance9);

        Cards chance10 = new Cards("Chance", "Advance to Trafalgar Square. If you pass go, collect £200.", 3, 24);
        cardsRepository.save(chance10);

        Cards chance11 = new Cards("Chance", "Your Building Loan matures. Collect £150", 1, 150);
        cardsRepository.save(chance11);

        Cards chance12 = new Cards("Chance", "Take a trip to Kings Cross Station. If you pass go, collect £200.", 3, 5);
        cardsRepository.save(chance12);

        Cards chance13 = new Cards("Chance", "Advance to Mayfair.", 3, 39);
        cardsRepository.save(chance13);

        Cards chance14 = new Cards("Chance", "Advance to the nearest Station. If unowned, you may buy it.  If owned, pay owner twice the current rental. ", 6, 0);
        cardsRepository.save(chance14);

        Cards chance15 = new Cards("Chance", "Advance to the nearest Station. If unowned, you may buy it.  If owned, pay owner twice the current rental. ", 6, 0);
        cardsRepository.save(chance15);

        Cards chance16 = new Cards("Chance", "Advance to the nearest Utility.  If unowned, you may buy it.  If owned, pay owner 10 times the amount on the dice.", 7, 0);
        cardsRepository.save(chance16);



    }
}
