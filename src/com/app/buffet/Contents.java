package com.app.buffet;

public class Contents {

    public static Object[][] ITEM_CLASS = new Object[][] {
            {1l, "凉菜", 1, "img/items/class/1.jpg"},
            {2l, "热菜", 2, "img/items/class/2.jpg"},
            {3l, "甜品", 3, "img/items/class/3.jpg"},
            {4l, "饮料", 4, "img/items/class/4.jpg"},
            {5l, "套餐", 4, "img/items/class/5.jpg"}
    };

    public static Object[][] ITEMS = new Object[][] {
            {100001l, "泡椒凤爪", 1l, "盘", 8.8, 8.8, -1d, 0, 1, 0, 1, "img/items/item/100001.jpg"},
            {100002l, "凉拌木耳", 1l, "盘", 13.5, 13.5, -1d, 0, 2, 0, 1, "img/items/item/100002.jpg"},
            {200001l, "清蒸鲈鱼", 2l, "份", 45, 40, -1d, 0, 7, 0, 1, "img/items/item/200001.jpg"},
            {200002l, "黄豆猪蹄", 2l, "份", 48, 45, -1d, 0, 6, 0, 0, "img/items/item/200002.jpg"},
            {200003l, "一品梅菜笋", 2l, "份", 16, 13.5, 10, 0, 3, 0, 0, "img/items/item/200003.jpg"},
            {200004l, "绍兴醉鸡", 2l, "盘", 28, 28, -1d, 0, 4, 0, 1, "img/items/item/200004.jpg"},
            {200005l, "香辣蹄花", 2l, "份", 36, 36, -1d, 0, 5, 0, 0, "img/items/item/200005.jpg"},
            {200006l, "红烧肉", 2l, "盘", 35, 35, -1d, 0, 2, 0, 0, "img/items/item/200006.jpg"},
            {200007l, "干炒牛河", 2l, "盘", 32, 32, -1d, 1, 1, 0, 0, "img/items/item/200006.jpg"},
            {300001l, "蜜糖吐司", 3l, "份", 22, 22, 5, 0, 1, 0, 0, "img/items/item/300001.jpg"},
            {400001l, "可口可乐", 4l, "瓶", 3, 3, -1d, 0, 1, 0, 0, "img/items/item/400001.jpg"},
            {400002l, "茉莉清茶", 4l, "瓶", 3.5, 3.5, -1d, 0, 2, 0, 0, "img/items/item/400002.jpg"},
            {500001l, "四人套餐", 5l, "份", 128, 128, -1d, 0, 1, 1, 0, "img/items/item/500001.jpg"},
            {500002l, "双人套餐", 5l, "份", 68, 68, -1d, 0, 1, 1, 0, "img/items/item/500002.jpg"}
    };

    public static Object[][] ITEM_SIZE = new Object[][] {
            {300001l, 3000011l, "草莓", 1, 22, 1, -1d, 0},
            {300001l, 3000012l, "芒果", 0, 22, 2, -1d, 1},
            {300001l, 3000013l, "猕猴桃", 0, 22, 3, -1d, 0},
            {200005l, 2000051l, "微辣", 0, 36, 1, -1d, 0},
            {200005l, 2000052l, "中辣", 0, 36, 2, -1d, 0},
            {200005l, 2000053l, "超辣", 0, 38, 3, -1d, 0},
            {200001l, 2000011l, "大份", 1, 45, 1, 12d, 0},
            {200001l, 2000012l, "小份", 0, 35, 2, -1d, 0}
    };

    public static Object[][] METHODS = new Object[][] {
            {200006l, 2000061l, "梅菜", 0, 0, 1},
            {200006l, 2000062l, "茶树菇", 2.5, 1, 2},
            {200006l, 2000063l, "少盐", 0, 0, 3}
    };

    public static Object[][] SETMEAL_GROUPS = new Object[][] {
            {500001l, 5000011l, "热菜", 3, 3, 1},
            {500001l, 5000012l, "凉菜", 2, 2, 2},
            {500001l, 5000013l, "饮料", 3, 1, 3},
            {500002l, 5000021l, "热菜", 2, 2, 1},
            {500002l, 5000022l, "饮料", 2, 1, 2}
    };

    public static Object[][] SETMEAL_ITEMS = new Object[][] {
            {500001l, 5000011l, 200001l, 2000011l, 1, 1, 0, 0, 0, 1},
            {500001l, 5000011l, 200002l, -1l, 0, 1, 0, 0, 0, 2},
            {500001l, 5000011l, 200003l, -1l, 0, 1, 0, 0, 0, 3},
            {500001l, 5000011l, 200004l, -1l, 0, 1, 1.5, 0, 0, 4},
            {500001l, 5000011l, 200005l, -1l, 0, 1, 0, 0, 0, 5},
            {500001l, 5000012l, 100001l, -1l, 1, 1, 0, 0, 0, 1},
            {500001l, 5000012l, 100002l, -1l, 1, 1, 0, 0, 0, 2},
            {500001l, 5000013l, 400001l, -1l, 1, 2, 0, 0, 0, 1},
            {500001l, 5000013l, 400002l, -1l, 1, 2, 0, 0, 0, 2},
            {500002l, 5000021l, 200005l, -1l, 1, 1, 0, 0, 0, 1},
            {500002l, 5000021l, 200001l, 2000011l, 0, 1, 0, 0, 0, 2},
            {500002l, 5000021l, 200006l, -1l, 0, 1, 0, 0, 0, 3},
            {500002l, 5000022l, 400001l, -1l, 1, 2, 0, 0, 0, 1},
    };

    public static Object[][] ADV_IMAGES = new Object[][] {
            {1l, 1, "img/adv/1.jpg"},
            {2l, 2, "img/adv/2.jpg"},
            {3l, 3, "img/adv/3.jpg"}
    };

}
