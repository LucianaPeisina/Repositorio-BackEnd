
package com.portfolio.miportfolioweb;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Optional;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


@Getter @Setter
@Entity
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deviceId;
    private String deviceType;
    private String notificationToken;


    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonIgnore
    private Usuario usuario;


    // constructores
    public Dispositivo() {
    }

    public Dispositivo(String deviceId, String deviceType, String notificationToken, Usuario usuario) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.notificationToken = notificationToken;
        this.usuario = usuario;
    }



    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setNotificationToken(String notificationToken) {
        this.notificationToken = notificationToken;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    // Constructor con deviceId y deviceType
    public Dispositivo(String deviceId, String deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
    }





}