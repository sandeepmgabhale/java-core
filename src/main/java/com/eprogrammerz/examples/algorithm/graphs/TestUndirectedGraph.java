package com.eprogrammerz.examples.algorithm.graphs;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestUndirectedGraph {
    @Test
    public void testBFS() {
        /**
         *
         * /**
         *                  6
         *                /   \
         *               4     5
         *             /  \     \
         *            1    2    3
         *
         */
        UndirectedGraph graph = new UndirectedGraph();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        d.connections = Arrays.asList(a, b);
        Node e = new Node(5);
        e.connections = Arrays.asList(c);
        Node f = new Node(6);
        f.connections = Arrays.asList(d,e);

        assertEquals(2, graph.findNode(f, 2).id);
    }
}
