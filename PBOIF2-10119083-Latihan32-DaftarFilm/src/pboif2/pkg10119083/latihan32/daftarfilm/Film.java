/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan32.daftarfilm;

/**
 *
 * @Nama : Rafsan Zen Mustaofa 
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Program Daftar Film
 */
public class Film {
    
    String nama;
    String genre;
    Double rating;
    int duration;
    
    public void nowPlaying(String nama,String genre , Double rating ,int duration){
     System.out.println("Daftar Film Sedang Tayang ");
     System.out.println("Judul Film: " +nama );
     System.out.println("Genre Film : "+genre);
     System.out.println("Rating Film : "+rating);
     System.out.println("Duration Film : "+duration+ " Menit");
     System.out.println("");
    
}
}
