package mcf;

public class LinkedList<E> extends NodeQueue<E> implements List<E> 
{
    public LinkedList()
    {
        //not really need because Java does it for us
        //but if we want to be explicit,we  can do this
        super();
    }

    @Override
    public void append(E value) {
        this.enqueue(value);
    }

    @Override
    public E get(int index){
    //    if(this.size() == 0 || index > this.size() || index < 0)
    //         throw new Exception(""+ index + " is out of bound!");
       if(index == this.size() - 1)
            return this.back.getValue();
       
       //it back so we need to loop through up to the index and return the value
       Node<E> copyNode = this.front;
       for(int i = 0; i < index; i++){
            if(i== index)
                break;

            
            copyNode = copyNode.getNext();
       }

       return copyNode.getValue();
    
    }

    @Override
    public void set(int index, E value) {
        //are we setting the back?
        if(index == this.size() - 1){
            this.back.setValue(value);
            return ;
        }

        Node<E> copyNode = this.front;
        for(int i = 0; i < index; i++){
            if(i == index)
                break;
            
            copyNode = copyNode.getNext();
        }

        copyNode.setValue(value);

    }

    @Override
    public String toString()
    {
        String result = super.toString();
        //strip out the -> with ,
        result = result.replaceAll("->",",");
        //replace null with blank
        result = result.replaceAll("null","");

        //remove the last ,
        result = result.substring(0, result.length()-1);

        return String.format("%d,[%s]", this.size(), result);
    }

}
