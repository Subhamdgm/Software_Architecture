import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

interface User {
  userId: number;
  name: string;
  phone: string;
  contacts: Contact[];
}

interface Contact {
  cId: number;
  email: string;
  contactName: string;
  userId: number;
}

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})


export class UserComponent implements OnInit {

  user: User | null = null;
  isLoading: boolean = false;
  errorMessage: string | null = null;

  constructor(private http: HttpClient) { }


  ngOnInit(): void {
    this.isLoading = true;
    this.http.get<User>('http://localhost:9002/user/1311')
      .subscribe({
        next: (user) => {
          this.user = user;
          this.isLoading = false;
        },
        error: (error) => {
          this.errorMessage = 'Error fetching user information: ' + error.message;
          this.isLoading = false;
          console.error('Error:', error); // Log detailed error for debugging
        }
      });
  }

}
