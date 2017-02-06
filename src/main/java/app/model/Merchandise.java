package app.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * Created by bailey on 2/4/2017.
 */
@Entity
public class Merchandise {
    private UUID id;
    private String name;
//    private ZonedDateTime createdOn;
//    private Attributes attributes;

//    public class Attributes {
//        private Double weight;
//        private Color color;
//
//        public Double getWeight() {
//            return weight;
//        }
//
//        public void setWeight(Double weight) {
//            this.weight = weight;
//        }
//
//        public Color getColor() {
//            return color;
//        }
//
//        public void setColor(Color color) {
//            this.color = color;
//        }
//    }

    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ZonedDateTime getCreatedOn() {
//        return createdOn;
//    }
//
//    public void setCreatedOn(ZonedDateTime createdOn) {
//        this.createdOn = createdOn;
//    }
//
//    public Attributes getAttributes() {
//        return attributes;
//    }
//
//    public void setAttributes(Attributes attributes) {
//        this.attributes = attributes;
//    }
}
