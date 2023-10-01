package org.models;

import org.interfaces.Moveable;

import java.util.ArrayList;
import java.util.Iterator;

public class Enemy implements Moveable, Iterable
{
    protected ArrayList<Integer> items;

    public Enemy()
    {
        items = new ArrayList<>();
        items.add(5);
        items.add(3);
        items.add(7);
    }

    public Enemy(int a)
    {
        items = new ArrayList<>();
        items.add(a);
    }

    @Override
    public void Move()
    {
        System.out.println("Enemy moved");

    }

    @Override
    public Iterator iterator()
    {
        return new EnemyIterator(this);
    }


    public class EnemyIterator implements Iterator
    {
        Enemy enemy;
        int cur = 0;

        public EnemyIterator(Enemy enemy)
        {
            this.enemy = enemy;
        }

        @Override
        public boolean hasNext()
        {
            return items.size() > cur;
        }

        @Override
        public Integer next()
        {
            var a = items.get(cur);
            cur++;
            return a;
        }
    }
}
