package com.Flonx.LinkedList;


/**
 * @Auther:Flonx
 * @Date:2021/1/17 - 01 - 17 - 12:25
 * @Description: com.Flonx.LinkedList
 * @Version: 1.0
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
//        先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

//        create a list
        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        add
//        singleLinkedList.add(hero1);
//        singleLinkedList.add(hero2);
//        singleLinkedList.add(hero3);
//        singleLinkedList.add(hero4);

        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero3);


        singleLinkedList.list();

    }
}

//    定义SingleLinkedList,管理我们的英雄人物
class SingleLinkedList {
    //    初始化头节点,头节点不要动
    private HeroNode head = new HeroNode(0, "", "");

    //    添加节点到单向链表
    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

//    在添加英雄时,根据排名将英雄插入到指定位置
    public void addByOrder(HeroNode heroNode){
        HeroNode temp  = head;
        boolean flag = false;//标识添加的编号是否存在,默认为false

        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.next.no>heroNode.no){
                break;
            }
            if(temp.next.no == heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag == true){
            System.out.println("can not add");
        }else{
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    //show the list
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp.toString());
//            将temp后移,
            temp = temp.next;
        }
    }
}

//定义一个HeroNode,每个HeroNode对象就是一个节点
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;//指向下一个节点

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    //    为了显示方法,我们重写toString方法
    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname="+nickname+"}";
    }

}
