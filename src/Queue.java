import java.io.*;

public class Queue {
    private Integer size = 0;
    Element head = new Element( null, null, null );
    Element tail = new Element( null, null, null );

    private class Element {
        Node node;
        Element next, prev;

        public Element( Node node, Element next, Element prev ) {
            this.node = node;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add( Node node ) {
        Element add;

        if( 0 == size ) {
            add = new Element( node, null, null );
            this.head = add;
            this.tail = add;
        }
        
        else {
            add = new Element( node, null, this.tail );
            add.prev = this.tail;
            this.tail.next = add;
            this.tail = add;
        }

        size++;
    }

    public Node remove( ) {
        if( 0 != size ) {
            Element rm = this.head;
            this.head = rm.next;
            size--;
            return rm.node;
        }

        else
            return null;
    }

    public Integer getSize( ) {
        return this.size;
    }

    public void iterateOver( ) {
        Integer position = 1;
        Element element = this.head;
        
        if( 0 == size )
            System.out.println( "There's no flight." );

        else
            do {
                System.out.println( "#"+ position++ + ": " + element.node.info( ) );
            } while( null != ( element = element.next ) );
    }

    public String showFirst( ) {
        return this.head.node.data( );
    }
}