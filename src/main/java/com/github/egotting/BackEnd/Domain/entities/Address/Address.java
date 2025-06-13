package com.github.egotting.BackEnd.Domain.entities.Address;


import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.City;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.States;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.Street;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.ZipCode;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;


public class Address {
    public Address(AddressBuilder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
        this.zpc = builder.zpc;
    }

    private Street street;
    private City city;
    private States state;
    private ZipCode zpc;
    private Customer user;

    public AddressBuilder getAddress() {
        return new AddressBuilder();
    }

    public static class AddressBuilder {
        private Street street;
        private City city;
        private States state;
        private ZipCode zpc;

        public AddressBuilder street(Street street) {
            this.street = street;
            return this;
        }

        public AddressBuilder city(City city) {
            this.city = city;
            return this;
        }

        public AddressBuilder state(States state) {
            this.state = state;
            return this;
        }

        public AddressBuilder zipCode(ZipCode zpc) {
            this.zpc = zpc;
            return this;
        }


        public Address build() {
            return new Address(this);
        }

    }

    @Override
    public String toString() {
        return "AddressBuilder{" +
                "street=" + street +
                ", city=" + city +
                ", state=" + state +
                ", zpc=" + zpc +
                '}';
    }
}
