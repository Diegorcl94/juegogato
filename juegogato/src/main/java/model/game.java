package model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false) private String code;
    @Column(nullable = false) private Integer mode; // 1=vs CPU,2=2 jugadores
    @Column(nullable= false) private LocalDateTime startTime;
    private LocalDateTime endTime;
    @Column(nullable = false)
    private Integer moveCount;
    private String winner; // "X", "O", "CPU", or "Draw"
    
}
