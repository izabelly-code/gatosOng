interface CardProps {
    className?: string
    children: React.ReactNode
}

function Card({className, children}: CardProps) {
    return(
        <div className={`rounded overflow-hidden shadow-lg bg-white ${className}`}>
            {children}

        </div>
    )
}

export default Card