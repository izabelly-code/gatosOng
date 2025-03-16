import Card from "../../Components/Layout/Card"
import Input from "../../Components/data-input/Input"
import { CiMail } from "react-icons/ci";
import { IoKeyOutline } from "react-icons/io5";
import Button from "../../Components/Layout/Button";



function Login() {
    return(
        <div className="w-full h-screen flex items-center justify-center">
            <Card className="flex flex-col gap-10">
                <div className="flex justify-center">
                <h1 className="font-medium">LOGIN</h1>
                </div>
                
                <div className="flex flex-col gap-4">
                <Input label="E-mail" type="text" icon={<CiMail></CiMail>} id="email" name="email" placeholder="youremail@email.com"></Input>
                <Input label="Password" type="password" icon={<IoKeyOutline></IoKeyOutline>} id="password" name="password" placeholder="Insert your password"></Input>

                <Button order="primary" text="Login"></Button>

                <a className="text-sky-700 cursor-pointer hover:text-sky-900">Don't have an account?</a>
                </div>
                
                
            </Card>
        </div>
    )
}

export default Login