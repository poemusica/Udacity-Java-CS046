public class MessageHider
{
    public String generateMessage() 
    {
        String[] messages = {
            "There are actually 5 secret messages hidden in this string. try starting at index 3\t",
            "Did you hear about the two guys who stole a calendar? They each got six months.",
            "What is the dumbest animal in the jungle? A polar bear.",
            "There are two fish in a tank. One looks at the other and says, do you have any idea how to drive this thing?",
            "Have you heard the joke about the broken pencil...? Never mind it's pointless."};
        String randomLetters = "knurY?htaxNcmfmIhKyzkaaA,.AgpnekdYchpboHyAtHp?gYjd.W,d.,qAakXXNkvlYd.mKdANl?ieNKckjqN.xfwiYYp?rhjxIt,igdaNXo,gneoscW?brNcWdqfc,?NXfoc.crWtXpYkescNkfzuucdidKXYgznwxbsjYsmqd,a,fzhssWeoKwwtatWYamYrAcKgDdq.cfwYl.DucuKnqyXnbNx,dxwga.wfxyy,ynX.HrKrrlxINufsrfIpt?gdK.iDo..WfNcIDi,czYzDuuuh,Iibnr,?uDfkc,xceH ";
        String filler = "x.N?qHykgtaWdqimfdktdg.?IsfhddsDlXgesisrwhqbvX.vWziIcnAinqHAsehodIb.mHKHAnjwysKxHHe?hkbADv,?A?lqIwvnoziHials.hjuWzxabjdnhrf.HKHnbfI,fmkhYwfibrAml.HgniumcykyNqpaHIxWwIYeXk.wlpnHDrKYw?f,hdvzuuvIyDhXXwqvAvgoq,hkstpcac,ycnwyvndjo.NqyrX?cI,vi.avtNdus.gDoefNp.W,,Iqswz?kxNnfxp.wfneorocvbeD?AuImWnDWNaierxn??DrzvDnlXlqyDWKnyoddHuXXl,xpAgyWHK.cizdHpzNmIriyIybx?H.AeAIaNaexwnXIoy.,IbplH?WiKirowjAXI?.bmNqWXpxtjlXsye.XYXv?ptKjNnur,Wwllqjxc.ocwrmdqpndfgcpmkzmH,uxku?ydftzchgvk,fdeqh?iX,cuwhughggpjduWdzyzYwwsnzsigqAlmph.kXewl,kl,vjeh?iIDWKzWqxhbryKInItcjsgyelsg";
        String[] separatedFiller = new String[10]; 

        int randomIndex = 0;
        for (int i = 0; i < 5; i++) 
        {
            int endRandomIndex = randomIndex + (110 - messages[i].length());
            String padding = randomLetters.substring(randomIndex, endRandomIndex);
            messages[i] = messages[i] + padding;
            randomIndex = endRandomIndex;
        }
        for (int i = 5; i < 10; i++)
        {
            separatedFiller[i] = filler.substring((i-5)*110, (i-4)*110);
        }
        for (int i = 0; i < 5; i++)
        {
            separatedFiller[i] = messages[i];
        }
        String finalMessage = "";
        for(int j = 0; j < 110; j++)
        {
            for (int i = 0; i < 10; i++)
            {
                finalMessage += separatedFiller[i].substring(j, j+1);
            }
        }
        System.out.println(finalMessage);
        return finalMessage;
    }
}
