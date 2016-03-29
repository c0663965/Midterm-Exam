/*
 * Copyright 2016 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd4414midterm2016w;

/**
 *
 * @author <Kihoo,Lee>
 */
public class Catalog {

    private int id;
    private String name;
    private String description;
    private int quantity;

    // TODO: Build the Getters and Setters for this Model Class
    
    // TODO: Build a toString method that returns a JSON String of the form:
    //   { "id" : XXX, "name" : "XXX", "description" : "XXX", "quantity" : XXX }

    public Catalog()
    {
        id=0;
        name="";
        description="";
        quantity=0;
    }
    
    public Catalog(int id, String name, String description, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        
        if(id<0)
            this.id=0;
        else 
            this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        
        if(quantity<0)
            this.quantity=0;
        else
            this.quantity = quantity;
    }
    
    @Override
    public String toString(){

        String str="{" +"\"id\""    + ":"+id+","+
                        "\"name\""  + ":"+"\""+name+"\"" +","+
                        "\"description\""+ ":"+"\""+description+"\""+","+
                        "\"quantity\""   + ":"+quantity+"}";
        return str;
    }
}
