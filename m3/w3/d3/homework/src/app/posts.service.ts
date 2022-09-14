import { Injectable } from '@angular/core';
import { Post } from './models/post';

@Injectable({
  providedIn: 'root',
})
export class PostsService {
  posts: Post[] = [
    {
      id: 1,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: true,
      type: 'news',
      author: 'marcoss',
    },
    {
      id: 2,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: true,
      type: 'education',
      author: 'Lusa',
    },
    {
      id: 3,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: false,
      type: 'politic',
      author: 'Carlo',
    },
    {
      id: 4,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: false,
      type: 'news',
      author: 'Mario',
    },
  ];

  getPosts() {
    return this.posts;
  }

  getPost(id: number) {
    return this.posts.find((post) => post.id == id);
  }

  updatePost(data: Partial<Post>, id: number) {
    this.posts = this.posts.map((post) =>
      post.id == id ? { ...post, ...data } : post
    );
    return this.posts.find((post) => post.id == id) as Post;
  }
}
