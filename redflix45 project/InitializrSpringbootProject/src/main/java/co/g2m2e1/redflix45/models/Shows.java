/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2m2e1.redflix45.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ESLUNAP Colaborador: Mikheltodd
 */
@Entity
@Table(name = "Shows")
public class Shows {

    @Id
    @Column(name = "show_title")
    private String showTitle;

    @Column(name = "show_seasons")
    private String showSeasons;

    @Column(name = "show_episodes")
    private String showEpisodes;

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public String getShowSeasons() {
        return showSeasons;
    }

    public void setShowSeasons(String showSeasons) {
        this.showSeasons = showSeasons;
    }

    public String getShowEpisodes() {
        return showEpisodes;
    }

    public void setShowEpisodes(String showEpisodes) {
        this.showEpisodes = showEpisodes;
    }
    
    
}
