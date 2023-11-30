package com.employee.java11.record;

public record NestedClassRecord (int id, String name, Contact contact) {

    public static class Contact{
        private final String email;
        private final String phone;

        public Contact(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
