import Card from "../../Components/Layout/Card"
import Input from "../../Components/data-input/Input"
import { CiMail } from "react-icons/ci";
import { IoKeyOutline } from "react-icons/io5";
import Button from "../../Components/Layout/Button";



function Signup() {
    return(
        <div className="w-full h-screen flex items-center justify-center">
            <Card className="flex flex-col gap-10">
                <div className="flex justify-center">
                <h1 className="font-medium">SIGNUP</h1>
                </div>
                
                <div className="flex flex-col gap-4">
                    <div className="flex gap-2">
                    <Input label="First Name" type="text" id="fname" name="fname" placeholder="Type your first name"></Input>
                    <Input label="Last Name" type="text" id="lname" name="lname" placeholder="Type your last name"></Input>
                    </div>

                    <div className="flex gap-2">
                    <Input label="DDD" type="number" id="ddd" name="ddd" placeholder="DDD" className="!w-[100px]"></Input>
                    <Input label="Telephone" type="number" id="tel" name="tel" placeholder="Type your telephone" className="w-full"></Input>
                    </div>
                    <Input label="CEP" type="number" id="cep" name="cep" placeholder="63748912"></Input>
                
                <Input label="E-mail" type="text" icon={<CiMail></CiMail>} id="email" name="email" placeholder="youremail@email.com"></Input>
                <Input label="Password" type="password" icon={<IoKeyOutline></IoKeyOutline>} id="password" name="password" placeholder="Insert your password"></Input>
                <Input label="Confirm your password" type="password" icon={<IoKeyOutline></IoKeyOutline>} id="password" name="password" placeholder="Confirm password"></Input>

                <Button order="primary" text="SIGNUP"></Button>

                <a className="text-sky-700 cursor-pointer hover:text-sky-900">Already have an account?</a>
                </div>
                
                
            </Card>
        </div>
    )
}

export default Signup