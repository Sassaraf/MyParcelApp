package com.example.myparcelapp.Entities;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class Parcel {

    //region VARIABLES

    private Status status=Status.Registered;
    private  Type type;
    private Boolean isFragile;
    private double weight;
    private String distributionCenterAddress;
    private String recipientAddress;
    private String recipientName;
    private String recipientPhoneNumber;
    private String ParcelID;
//endregion

    //region CONSTRUCTOR
    public Parcel() {this(Status.Registered,Type.SmallPackage,false,0,"","","","",""); }

    public Parcel(Status status, Type type, Boolean isFragile, double weight, String distributionCenterAddress, String recipientAddress, String recipientName, String recipientPhoneNumber, String parcelID) {
        this.status = status;
        this.type = type;
        this.isFragile = isFragile;
        this.weight = weight;
        this.distributionCenterAddress = distributionCenterAddress;
        this.recipientAddress = recipientAddress;
        this.recipientName = recipientName;
        this.recipientPhoneNumber = recipientPhoneNumber;
        ParcelID = parcelID;
    }
   // endregion

    //region GETTERS&SETTERS

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Boolean getFragile() {
        return isFragile;
    }

    public void setFragile(Boolean fragile) {
        isFragile = fragile;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDistributionCenterAddress() {
        return distributionCenterAddress;
    }

    public void setDistributionCenterAddress(String distributionCenterAddress) {
        this.distributionCenterAddress = distributionCenterAddress;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    public void setRecipientPhoneNumber(String recipientPhoneNumber) {
        this.recipientPhoneNumber = recipientPhoneNumber;
    }

    public String getParcelID() {
        return ParcelID;
    }

    public void setParcelID(String parcelID) {
        ParcelID = parcelID;
    }
    //endregion

//   String key=myRef1.push().getKey();
//    newParcel.setParcelID(key);
//    myRef1.child(key).setValue(newParcel);


}
