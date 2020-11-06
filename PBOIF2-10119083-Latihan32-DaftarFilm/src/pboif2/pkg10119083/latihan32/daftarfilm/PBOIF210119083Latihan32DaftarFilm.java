/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan32.daftarfilm;

/**
 *
 * Nama : Rafsan Zen Mustaofa 
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Program daftar film
 */
public class PBOIF210119083Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film flm = new Film();
        flm.nama="Venom";
        flm.genre="Action";
        flm.rating=8.5;
        flm.duration=120;
        flm.nowPlaying(flm.nama,flm.genre,flm.rating,flm.duration) ;
        
        Film flm2 = new Film();
        flm2.nama="Small Foot";
        flm2.genre="Animation";
        flm2.rating=9.0;
        flm2.duration=96;
        flm2.nowPlaying(flm2.nama,flm2.genre,flm2.rating,flm2.duration) ;
        
        Film flm3 = new Film(); 
        flm3.nama="Crazy Rich Asian";
        flm3.genre="Comedy";
        flm3.rating=7.8;
        flm3.duration=119;
        flm3.nowPlaying(flm3.nama,flm3.genre,flm3.rating,flm3.duration) ;
        
        Film flm4 = new Film();
        flm4.nama="Asih";
        flm4.genre=" Horor ";
        flm4.rating=6.0;
        flm4.duration=100;
        flm4.nowPlaying(flm4.nama,flm4.genre,flm4.rating,flm4.duration) ;
        
         System.out.println("-------------------------------------");
         System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
}
