class Main{
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.add(10);
        linkList.add(20);
        linkList.add(30);
        linkList.add(40);
        linkList.add(50);

        linkList.displayLinkList();
        
        System.out.println("Now we are adding between link list");
        
        LinkList linkList2 = new LinkList();

        linkList2.add(60);
        linkList2.add(70);
        linkList2.add(80);

        linkList.addBetween(20, linkList, linkList2);

        linkList.displayLinkList();
        

       }
}