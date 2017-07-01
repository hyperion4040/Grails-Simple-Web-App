package grails.simple.web.app

class UserController {

    def start() { }

    def save() {
        def user = new User(params)
        user.save()
        render(view: "user", model: [user:user])
    }
}
