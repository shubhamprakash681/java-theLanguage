package com.shubham.temp;
import java.util.*;
import java.lang.*;
import java.io.*;


class Pair
{
    int first, second;

    public Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}

public class Cvt{

    static final int infi = (int)10e8;

    // Class of the node
    static class Node
    {
        int vertexNumber;


        List<Pair> children;

        Node(int vertexNumber)
        {
            this.vertexNumber = vertexNumber;
            children = new ArrayList<>();
        }


        void add_child(int vNumber, int length)
        {
            Pair p = new Pair(vNumber, length);
            children.add(p);
        }
    }


    static int[] dijkstraDist(List<Node> g,
                              int s, int[] path)
    {


        int[] dist = new int[g.size()];


        boolean[] visited = new boolean[g.size()];
        for(int i = 0; i < g.size(); i++)
        {
            visited[i] = false;
            path[i] = -1;
            dist[i] = infi;
        }
        dist[s] = 0;
        path[s] = -1;
        int current = s;


        Set<Integer> sett = new HashSet<>();
        while (true)
        {


            visited[current] = true;
            for(int i = 0;
                i < g.get(current).children.size();
                i++)
            {
                int v = g.get(current).children.get(i).first;

                if (visited[v])
                    continue;


                sett.add(v);
                int alt = dist[current] +
                        g.get(current).children.get(i).second;


                if (alt < dist[v])
                {
                    dist[v] = alt;
                    path[v] = current;
                }
            }
            sett.remove(current);

            if (sett.isEmpty())
                break;


            int minDist = infi;
            int index = 0;


            for(int a : sett)
            {
                if (dist[a] < minDist)
                {
                    minDist = dist[a];
                    index = a;
                }
            }
            current = index;
        }
        return dist;
    }


    void printPath(int[] path, int i, int s)
    {
        if (i != s)
        {


            if (path[i] == -1)
            {
                System.out.println("Path not found!!");
                return;
            }
            printPath(path, path[i], s);
            System.out.print(path[i] + " ");
        }
    }


    public static void main(String[] args)throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Node> v = new ArrayList<>();


        // Loop to create the nodes
        for(int i = 0; i < n; i++)
        {
            Node a = new Node(i);
            v.add(a);
        }
        for(int i=0;i<n;i++){
            String[] values = br.readLine().split(" ");
            for(int j=0;j<values.length;j++){
                v.get(i).add_child((Integer.parseInt(values[j])-1),1);
            }
        }
        String sad=br.readLine();
        int s=Integer.parseInt(sad.split(" ")[0])-1;
        int e=Integer.parseInt(sad.split(" ")[1])-1;





        int[] path = new int[v.size()];
        int[] dist = dijkstraDist(v, s, path);


        for(int i = 0; i < dist.length; i++)
        {
            if (dist[i] == infi)
            {

                System.out.println(-1);
                continue;
            }
            {

                if(i==e ){
                    System.out.println(dist[i]);
                }
            }
        }
    }
}