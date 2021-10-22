package sportyshoe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class users {

	
		


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long user_id;
		
		@Column
		private String username;
		
		@Column
		private String password;
		
		@Column
		private String role;
		
		@Column
		private short enabled;
		
		
		public Long getUser_id() {
			return user_id;
		}

		public void setUser_id(Long user_id) {
			this.user_id = user_id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public short getEnabled() {
			return enabled;
		}

		public void setEnabled(short enabled) {
			this.enabled = enabled;
		}
}
