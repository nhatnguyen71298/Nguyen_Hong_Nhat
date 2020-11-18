import { Component } from '@angular/core' ;

@Component({
  template : '<h2>Pet profile</h2>\n' +
    '<label>\n' +
    '    Pet name:\n' +
    '    <input type="text" (change)="updateName($event.target.value)">\n' +
    '</label>\n' +
    '<br >\n' +
    '<label>\n' +
    '    Pet image:\n' +
    '    <input type="url" (change)="updateImage($event.target.value)">\n' +
    '</label>\n' +
    '<br >\n' +
    '<h3>Pet name: {{petName}}</h3>\n' +
    '<img [src]="petImage" style="max-width: 100%">' ,
  selector :  'pet-lanh-style'
})

export class PetComponent {
  petName = 'Lương Vũ Quang Đin';
  petImage = 'https://scontent.fsgn2-3.fna.fbcdn.net/v/t1.0-9/67797272_481890285933386_1724639539273662464_n.jpg?_nc_cat=108&ccb=2&_nc_sid=85a577&_nc_ohc=NKw9ZGFAiUoAX_ozg8l&_nc_ht=scontent.fsgn2-3.fna&oh=f8ec87d6caa053e87b2120fd422adb90&oe=5FDA4703';
  constructor() { }

  updateName(name) {
    this.petName = name;
  }

  updateImage(image) {
    this.petImage = image;
  }
}
