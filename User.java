package data;

import jakarta.persistence.*;

    @Entity
    @Table(name = "user")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "userId")
        private int userId;

        @Column(name = "Username")
        private int username;

        @Column(name = "Email")
        private int email;

        @Column(name = "Password")
        private int password;


        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getUsername() {
            return username;
        }

        public void setUsername(int username) {
            this.username = username;
        }

        public int getEmail() {
            return email;
        }

        public void setEmail(int email) {
            this.email = email;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }
    }


