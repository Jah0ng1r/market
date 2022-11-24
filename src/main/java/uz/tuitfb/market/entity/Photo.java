package uz.tuitfb.market.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "photo")
public class Photo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Transient
    private static final String sequence = "photo_sequence";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = sequence)
    @SequenceGenerator(name = sequence, sequenceName = sequence, allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "photo_name")
    private String photoName;

    @Column(name = "size", nullable = true)
    private String size;

    @Column(name = "path", nullable = false)
    private String absalutepath;

    @Column(name = "extension", nullable = false)
    private String extension;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAbsalutepath() {
        return absalutepath;
    }

    public void setAbsalutepath(String absalutepath) {
        this.absalutepath = absalutepath;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
