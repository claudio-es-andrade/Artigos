# Edit this configuration file to define what should be installed on
# your system. Help is available in the configuration.nix(5) man page, on
# https://search.nixos.org/options and in the NixOS manual (`nixos-help`).

{ config, lib, pkgs, ... }:

{
  imports =
    [ # Include the results of the hardware scan.
      ./hardware-configuration.nix
    ];
  
  nixpkgs.config.allowUnfree = true;
  
  # Use the systemd-boot EFI boot loader.
  boot.loader.systemd-boot.enable = true;
  boot.loader.efi.canTouchEfiVariables = true;
  
  # Kernel LTS (Long Term Support).
  boot.kernelPackages = pkgs.linuxPackages_6_12;
   
  networking.hostName = "nixos"; # Define your hostname.

  # Configure network connections interactively with nmcli or nmtui.
  networking.networkmanager.enable = true;

  # Set your time zone.
  time.timeZone = "America/Sao_Paulo";

  i18n.defaultLocale = "pt_BR.UTF-8";
  i18n.extraLocaleSettings = {
    LC_ADDRESS = "pt_BR.UTF-8";
    LC_IDENTIFICATION = "pt_BR.UTF-8";
    LC_MEASUREMENT = "pt_BR.UTF-8";
    LC_MONETARY = "pt_BR.UTF-8";
    LC_NAME = "pt_BR.UTF-8";
    LC_NUMERIC = "pt_BR.UTF-8";
    LC_PAPER = "pt_BR.UTF-8";
    LC_TELEPHONE = "pt_BR.UTF-8";
    LC_TIME = "pt_BR.UTF-8";
  }; 

  # Enable the X11 windowing system.
  services.xserver.enable = true;

  # Enable the GNOME Desktop Environment.
  services.displayManager.gdm.enable = true;
  services.desktopManager.gnome.enable = true;
  
  # Configure keymap in X11
  services.xserver.xkb.layout = "br";
  # services.xserver.xkb.options = "eurosign:e,caps:escape";
  
  # Configure console keymap
  console.keyMap = "br-abnt2";

  services.pipewire = {
     enable = true;
     alsa.enable = true;
     alsa.support32Bit = true;
     pulse.enable = true;
   };

  # Define a user account. Don't forget to set a password with ‘passwd’.
   users.users.claudio = {
     isNormalUser = true;
     createHome = true;
     extraGroups = [ "wheel" "networkmanager" ]; # Enable ‘sudo’ for the user.
     packages = with pkgs; [
  #     tree
     ];
   };

   programs.firefox.enable = true;
   
   environment.systemPackages = with pkgs; [
     vim
     wget
     curl
     gitFull
     nixos-generators

     gnome-tweaks
     gnome-extension-manager

     appimage-run

   ];
  
  # AppImage Linux Kernel Instructions
  programs.appimage = {
     enable = true;
     binfmt = true;
  };  

  # Install FLATPAK
  services.flatpak.enable = true;
  
  systemd.services.flatpak-repo = {
    wantedBy = ["multi-user.target"];
    path = [ pkgs.flatpak ];
    script = '' 
       flatpak remote-add --if-not-exists flathub https://dl.flathub.org/repo/flathub.flatrepo
    '';
  }; 

    # Creating Swap Space
  swapDevices = [{
    device = "/swapfile";
    size = 2 * 1024; # 2GB
  }];
     
  # Firewall Enabled by Default
  networking.firewall.enable = true;

  system.stateVersion = "25.11"; # Did you read the comment?

}

